// license-header java merge-point
/* Autogenerated on 07/23/2012 17:27:03+0530 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceSEIImplTest.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleWebService
 * STEREOTYPE:  WebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.vo.DatesVO;
import com.myjeeva.andromda.demo.vo.GreetingVO;
import com.myjeeva.andromda.demo.vo.StringsVO;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * WebService Service Delegate Test for the SampleWebService service.
 * 
 */

public class SampleWebServiceSEIImplTest extends TestCase
{
    /**
     * Constructor
     * @param name test case name
     */
    public SampleWebServiceSEIImplTest(String name)
    {
        super(name);
    }

    /**
     * No arg Constructor. Delegates to constructor(String) with test case name
     */
    public SampleWebServiceSEIImplTest()
    {
        super("SampleWebService");
    }

    /**
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    /**
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleWebServiceSEIImpl#SampleWebServiceSEIImpl()}.
     */
    public void testSampleWebServiceSEIImplGetDates()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetDatesImpl.getDatesSetUp();
        GetDates getDatesInput = GetDatesImpl.getDatesCreateInput();
        SampleWebServiceSEIImpl delegate = new SampleWebServiceSEIImpl();
        System.out.println("Invoking SampleWebServiceSEIImpl.getDates with " + getDatesInput);
        try
        {
                DatesVO rtn = delegate.getDates(
                 getDatesInput.getStart()  // java.util.Date
                , getDatesInput.getEnd()  // java.util.Date
            );
            System.out.println("SampleWebServiceSEIImpl.getDates" + " returned " + rtn);
        }
        catch (Exception ex)
        {
            System.out.println("SampleWebServiceSEIImpl.getDates" + " threw exception " + ex);
            fail(ex.toString());
        }
        GetDatesImpl.getDatesTearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleWebServiceSEIImpl#SampleWebServiceSEIImpl()}.
     */
    public void testSampleWebServiceSEIImplGetServiceGreeting()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetServiceGreetingImpl.getServiceGreetingSetUp();
        SampleWebServiceSEIImpl delegate = new SampleWebServiceSEIImpl();
        System.out.println("Invoking SampleWebServiceSEIImpl.getServiceGreeting");
            GreetingVO rtn = delegate.getServiceGreeting(
        );
        System.out.println("SampleWebServiceSEIImpl.getServiceGreeting" + " returned " + rtn);
        GetServiceGreetingImpl.getServiceGreetingTearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleWebServiceSEIImpl#SampleWebServiceSEIImpl()}.
     */
    public void testSampleWebServiceSEIImplGetStrings()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetStringsImpl.getStringsSetUp();
        GetStrings getStringsInput = GetStringsImpl.getStringsCreateInput();
        SampleWebServiceSEIImpl delegate = new SampleWebServiceSEIImpl();
        System.out.println("Invoking SampleWebServiceSEIImpl.getStrings with " + getStringsInput);
            StringsVO rtn = delegate.getStrings(
             getStringsInput.getOptional()  // java.lang.String
            , getStringsInput.getRequired()  // java.lang.String
        );
        System.out.println("SampleWebServiceSEIImpl.getStrings" + " returned " + rtn);
        GetStringsImpl.getStringsTearDown();
    }

    /**
     * main() method to run the test with the textual test runner.
     * @param args Not used
     */
    public static void main(final String[] args)
    {
        TestRunner.run(SampleWebServiceSEIImplTest.class);
    }
}