package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterAlreadyExists.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/corba/src/java.corba/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, December 19, 2017 6:16:18 PM PST
*/

public final class AdapterAlreadyExists extends org.omg.CORBA.UserException
{

  public AdapterAlreadyExists ()
  {
    super(AdapterAlreadyExistsHelper.id());
  } // ctor


  public AdapterAlreadyExists (String $reason)
  {
    super(AdapterAlreadyExistsHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterAlreadyExists
