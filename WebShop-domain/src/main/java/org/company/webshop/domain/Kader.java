/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Thu Apr 29 13:40:36 CEST 2010
 *     Application model: Kader
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.webshop.domain;

import org.company.webshop.domain.KaderImplBase;
import org.mod4j.runtime.exception.BusinessRuleException;
import org.springframework.util.ClassUtils;
import org.springframework.validation.BindException;

/**
 * 
 * 
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Kader extends KaderImplBase {

    @Override
    public boolean removeFromOrganisaties(Organisatie element) {
        for (CasusOverleg overleg : element.getOverleggen()) {
            if (overleg.getDatum().isAfterNow()) {
                BindException errors = new BindException(this, ClassUtils
                        .getShortNameAsProperty(this.getClass()));
                errors.reject("organisatie.casusoverleg.toekomst", new Object[] { element },
                        "organisatie mag niet worden verwijderd als er"
                                + " nog casusoverleggen gevoerd zullen worden in de toekomst");
                throw new BusinessRuleException(errors);
            }
        }
        return super.removeFromOrganisaties(element);
    }

    /**
     * Default no-argument constructor for Kader
     */
    protected Kader() {

    }

    /**
     * Minimal constructor for Kader
     * 
     * @param naam
     *            (String)
     */
    public Kader(String naam) {
        super(naam);
    }

}