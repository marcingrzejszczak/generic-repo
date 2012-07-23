// license-header java merge-point
/* Autogenerated on 07/23/2012 17:27:03+0530 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceDelegate.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleWebService
 * STEREOTYPE:  WebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.exceptions.DeclaredException;
import com.myjeeva.andromda.demo.vo.DatesVO;
import com.myjeeva.andromda.demo.vo.GreetingVO;
import com.myjeeva.andromda.demo.vo.StringsVO;
import java.util.Date;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * WebService Service Endpoint Implementation delegate for the SampleWebService service.
 * 
 */

public class SampleWebServiceWSDelegate
{
   // private static final Logger LOG = LoggerFactory.getLogger(SampleWebServiceWSDelegate.class);
   // private static final String className = "SampleWebServiceWSDelegate";

    /**
     * Constructor
     */
    public SampleWebServiceWSDelegate()
    {
        //Documented empty code block - avoid compiler warning
    }

   /**
    * Invokes the getDates service method on SampleWebService.
    * 
    * @param start datatype DateTime multiplicity=1..1
    * @param end datatype DateTime multiplicity=1..1
    * @return getDatesResponse DatesVO
    * @throws DeclaredException
    */
    public DatesVO getDates
    (
        Date start
      , Date end
    )
        throws DeclaredException
    {        
        DatesVO rtn = new DatesVO();
        rtn.setStart(start);
        rtn.setEnd(end);
        return rtn;
    }

   /**
    * Invokes the getServiceGreeting service method on SampleWebService.
    * 
    * @return getServiceGreetingResponse GreetingVO
    */
    public GreetingVO getServiceGreeting
    (
    )
    {        
        GreetingVO rtn = new GreetingVO();
        rtn.setMessage("Welcome to SOAP Web Services Using AndroMDA by www.myjeeva.com");
        return rtn;
    }

   /**
    * Invokes the getStrings service method on SampleWebService.
    * 
    * @param optional datatype String multiplicity=0..1
    * @param required datatype String multiplicity=1..1
    * @return getStringsResponse StringsVO
    */
    public StringsVO getStrings
    (
        String optional
      , String required
    )
    {        
        StringsVO rtn = new StringsVO();
        rtn.setOptional(optional);
        rtn.setRequired(required);
        return rtn;
    }
}