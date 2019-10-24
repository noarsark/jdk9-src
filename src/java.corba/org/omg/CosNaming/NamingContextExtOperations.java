package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExtOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from t:/workspace/corba/src/java.corba/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, December 19, 2017 6:16:14 PM PST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <code>NamingContextExt</code>, you can use
 * URL-based names to bind and resolve.
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContextExtOperations  extends org.omg.CosNaming.NamingContextOperations
{

  /**
 * This operation creates a stringified name from the array of Name
 * components.
 * 
 * @param n Name of the object.
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.
 * 
 */
  String to_string (org.omg.CosNaming.NameComponent[] n) throws org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
 * This operation  converts a Stringified Name into an  equivalent array
 * of Name Components.
 * 
 * @param sn Stringified Name of the object.
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.
 * 
 */
  org.omg.CosNaming.NameComponent[] to_name (String sn) throws org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
 * This operation creates a URL based "iiopname://" format name
 * from the Stringified Name of the object.
 * 
 * @param addr internet based address of the host machine where Name Service is running.
 * @param sn Stringified Name of the object.
 * 
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.
 * @exception org.omg.CosNaming.NamingContextPackage.InvalidAddress
 * Indicates the internet based address of the host machine is incorrect
 */
  String to_url (String addr, String sn) throws org.omg.CosNaming.NamingContextExtPackage.InvalidAddress, org.omg.CosNaming.NamingContextPackage.InvalidName;

  /**
 * This operation resolves the Stringified name into the object
 * reference. 
 * 
 * @param sn Stringified Name of the object.
 * 
 * @exception org.omg.CosNaming.NamingContextPackage.NotFound
 * Indicates there is no object reference for the given name.
 * @exception org.omg.CosNaming.NamingContextPackage.CannotProceed
 * Indicates that the given compound name is incorrect.
 * @exception org.omg.CosNaming.NamingContextExtPackage.InvalidName
 * Indicates the name does not identify a binding.
 * 
 */
  org.omg.CORBA.Object resolve_str (String sn) throws org.omg.CosNaming.NamingContextPackage.NotFound, org.omg.CosNaming.NamingContextPackage.CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName;
} // interface NamingContextExtOperations
