package com.phone.phone.model;

import com.phone.phone.entity.Phone;
import com.phone.phone.model.phone.MySQLPhoneModel;
import com.phone.phone.model.phone.PhoneModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySQLPhoneModelTest {
private PhoneModel phoneModel;

    @BeforeEach
    void setUp() {
        this.phoneModel = new MySQLPhoneModel();
    }

    @Test
    void save() {
        Phone phone = new Phone();
        phone.setBrandId(1);
        phone.setName("Nokia 2000");
        phone.setPrice(100);
        phone.setDescription("Lorem ipsum");
        phoneModel.save(phone);
    }

    @Test
    void findAll() {

    }
}