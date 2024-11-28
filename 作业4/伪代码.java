//方法函数：
//1.入库登记方法：
public void addInventory(int qty, double cost) {
    qOH += qty;
    evenCost = ((evenCost * qOH) + (cost * qty)) / (qOH + qty);
}

// 2.出库登记方法：
public boolean removeInventory(int qty) {
    if (qOH >= qty) {
        qOH -= qty;
        return true;
    } else {
        return false; // 库存不足
    }
}

// 3.更新库存均价：
public void updateAverageCost(double newCost, int newQty) {
    evenCost = (evenCost * qOH + newCost * newQty) / (qOH + newQty);
}

// 4.盘存方法：
public void inventoryCheck(int actualQty) {
    qOH = actualQty; // 更新为实际库存量
}
