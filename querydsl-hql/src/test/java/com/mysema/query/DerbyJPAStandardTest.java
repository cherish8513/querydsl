/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query;

import org.junit.runner.RunWith;



/**
 * @author tiwe
 *
 */
@RunWith(JPATestRunner.class)
@JPAConfig("derby")
public class DerbyJPAStandardTest extends AbstractJPATest{

    @Override
    protected Target getTarget() {
        return Target.DERBY;
    }
    
}
