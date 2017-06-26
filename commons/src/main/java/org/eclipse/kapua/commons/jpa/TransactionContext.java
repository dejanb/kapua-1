/*******************************************************************************
 * Copyright (c) 2011, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.commons.jpa;


public class TransactionContext {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public TransactionContext(EntityManagerFactory emf, EntityManager em) {
        this.emf = emf;
        this.em = em;
    }
    
    public EntityManagerFactory getEntityManagerFactory() {
        return this.emf;
    }
    
    public EntityManager getEntityManager() {
        return this.em;
    }
}