package org.omg.IOP;


/**
* org/omg/IOP/ServiceContext.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/corba/src/java.corba/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, December 19, 2017 6:16:16 PM PST
*/

public final class ServiceContext implements org.omg.CORBA.portable.IDLEntity
{

  /** The service context id */
  public int context_id = (int)0;

  /** The data associated with this service context */
  public byte context_data[] = null;

  public ServiceContext ()
  {
  } // ctor

  public ServiceContext (int _context_id, byte[] _context_data)
  {
    context_id = _context_id;
    context_data = _context_data;
  } // ctor

} // class ServiceContext
