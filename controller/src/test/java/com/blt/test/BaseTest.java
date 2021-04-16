package com.blt.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application.yml"})
//@TransactionConfiguration(transactionManager="jdbcTransactionManager",defaultRollback=true)
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}