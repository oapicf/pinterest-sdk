@isTest
private class OASLabelCreateRequestLabelsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = labelCreateRequestLabelsInner1;
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner3 = new OASLabelCreateRequestLabelsInner();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner4 = labelCreateRequestLabelsInner3;

        System.assert(labelCreateRequestLabelsInner1.equals(labelCreateRequestLabelsInner2));
        System.assert(labelCreateRequestLabelsInner2.equals(labelCreateRequestLabelsInner1));
        System.assert(labelCreateRequestLabelsInner1.equals(labelCreateRequestLabelsInner1));
        System.assert(labelCreateRequestLabelsInner3.equals(labelCreateRequestLabelsInner4));
        System.assert(labelCreateRequestLabelsInner4.equals(labelCreateRequestLabelsInner3));
        System.assert(labelCreateRequestLabelsInner3.equals(labelCreateRequestLabelsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner3 = new OASLabelCreateRequestLabelsInner();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner4 = new OASLabelCreateRequestLabelsInner();

        System.assert(labelCreateRequestLabelsInner1.equals(labelCreateRequestLabelsInner2));
        System.assert(labelCreateRequestLabelsInner2.equals(labelCreateRequestLabelsInner1));
        System.assert(labelCreateRequestLabelsInner3.equals(labelCreateRequestLabelsInner4));
        System.assert(labelCreateRequestLabelsInner4.equals(labelCreateRequestLabelsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = new OASLabelCreateRequestLabelsInner();

        System.assertEquals(false, labelCreateRequestLabelsInner1.equals('foo'));
        System.assertEquals(false, labelCreateRequestLabelsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = new OASLabelCreateRequestLabelsInner();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner3;

        System.assertEquals(false, labelCreateRequestLabelsInner1.equals(labelCreateRequestLabelsInner3));
        System.assertEquals(false, labelCreateRequestLabelsInner2.equals(labelCreateRequestLabelsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = new OASLabelCreateRequestLabelsInner();

        System.assertEquals(labelCreateRequestLabelsInner1.hashCode(), labelCreateRequestLabelsInner1.hashCode());
        System.assertEquals(labelCreateRequestLabelsInner2.hashCode(), labelCreateRequestLabelsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner1 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner2 = OASLabelCreateRequestLabelsInner.getExample();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner3 = new OASLabelCreateRequestLabelsInner();
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner4 = new OASLabelCreateRequestLabelsInner();

        System.assert(labelCreateRequestLabelsInner1.equals(labelCreateRequestLabelsInner2));
        System.assert(labelCreateRequestLabelsInner3.equals(labelCreateRequestLabelsInner4));
        System.assertEquals(labelCreateRequestLabelsInner1.hashCode(), labelCreateRequestLabelsInner2.hashCode());
        System.assertEquals(labelCreateRequestLabelsInner3.hashCode(), labelCreateRequestLabelsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLabelCreateRequestLabelsInner labelCreateRequestLabelsInner = new OASLabelCreateRequestLabelsInner();
        Map<String, String> x-property-mappings = labelCreateRequestLabelsInner.getx-property-mappings();
        System.assertEquals('labelType', x-property-mappings.get('label_type'));
    }
}
