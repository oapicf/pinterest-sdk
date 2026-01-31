@isTest
private class OASLabelTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = label1;
        OASLabel label3 = new OASLabel();
        OASLabel label4 = label3;

        System.assert(label1.equals(label2));
        System.assert(label2.equals(label1));
        System.assert(label1.equals(label1));
        System.assert(label3.equals(label4));
        System.assert(label4.equals(label3));
        System.assert(label3.equals(label3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = OASLabel.getExample();
        OASLabel label3 = new OASLabel();
        OASLabel label4 = new OASLabel();

        System.assert(label1.equals(label2));
        System.assert(label2.equals(label1));
        System.assert(label3.equals(label4));
        System.assert(label4.equals(label3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = new OASLabel();

        System.assertEquals(false, label1.equals('foo'));
        System.assertEquals(false, label2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = new OASLabel();
        OASLabel label3;

        System.assertEquals(false, label1.equals(label3));
        System.assertEquals(false, label2.equals(label3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = new OASLabel();

        System.assertEquals(label1.hashCode(), label1.hashCode());
        System.assertEquals(label2.hashCode(), label2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabel label1 = OASLabel.getExample();
        OASLabel label2 = OASLabel.getExample();
        OASLabel label3 = new OASLabel();
        OASLabel label4 = new OASLabel();

        System.assert(label1.equals(label2));
        System.assert(label3.equals(label4));
        System.assertEquals(label1.hashCode(), label2.hashCode());
        System.assertEquals(label3.hashCode(), label4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLabel label = new OASLabel();
        Map<String, String> x-property-mappings = label.getx-property-mappings();
        System.assertEquals('labelType', x-property-mappings.get('label_type'));
        System.assertEquals('parentId', x-property-mappings.get('parent_id'));
        System.assertEquals('parentType', x-property-mappings.get('parent_type'));
    }
}
