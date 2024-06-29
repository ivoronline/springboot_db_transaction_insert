package com.ivoronline.springboot_db_transaction_insert.service;

import com.ivoronline.springboot_db_transaction_insert.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Connection;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private MyRepository myRepository;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public void insert() throws Exception {

    //INSERT RECORDS
    for (int i = 1; i <= 2; i++) {
      if(i==2) { throw new Exception("Exception"); }
      myRepository.insert("Person " + i, 10 * i);
    }

  }

}
