

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

import com.rti.dds.infrastructure.*;
import com.rti.dds.cdr.CdrHelper;

public class ShapeTypeExtended  extends ShapeType{

    public ShapeFillKind fillKind = (ShapeFillKind)ShapeFillKind.valueOf(0);
    public float angle = (float)0;

    public ShapeTypeExtended() {

        super();

    }
    public ShapeTypeExtended (ShapeTypeExtended other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ShapeTypeExtended self;
        self = new  ShapeTypeExtended();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        fillKind = ShapeFillKind.valueOf(0);
        angle = (float)0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if (!super.equals(o)) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        ShapeTypeExtended otherObj = (ShapeTypeExtended)o;

        if(!fillKind.equals(otherObj.fillKind)) {
            return false;
        }
        if(angle != otherObj.angle) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += fillKind.hashCode(); 
        __result += (int)angle;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ShapeTypeExtendedTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        ShapeTypeExtended typedSrc = (ShapeTypeExtended) src;
        ShapeTypeExtended typedDst = this;
        super.copy_from(typedSrc);
        typedDst.fillKind = (ShapeFillKind) typedDst.fillKind.copy_from(typedSrc.fillKind);
        typedDst.angle = typedSrc.angle;

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        strBuffer.append(super.toString("",indent));

        strBuffer.append(fillKind.toString("fillKind ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("angle: ").append(angle).append("\n");  

        return strBuffer.toString();
    }

}
