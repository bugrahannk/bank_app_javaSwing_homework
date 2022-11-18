package database;

import database.operations.AccountInfo;

public interface IDataControl {
    public boolean isThereData();
    public AccountInfo getAccountInfo();
}
