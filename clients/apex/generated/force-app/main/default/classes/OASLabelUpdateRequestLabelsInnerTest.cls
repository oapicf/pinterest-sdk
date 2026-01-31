@isTest
private class OASLabelUpdateRequestLabelsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = labelUpdateRequestLabelsInner1;
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner3 = new OASLabelUpdateRequestLabelsInner();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner4 = labelUpdateRequestLabelsInner3;

        System.assert(labelUpdateRequestLabelsInner1.equals(labelUpdateRequestLabelsInner2));
        System.assert(labelUpdateRequestLabelsInner2.equals(labelUpdateRequestLabelsInner1));
        System.assert(labelUpdateRequestLabelsInner1.equals(labelUpdateRequestLabelsInner1));
        System.assert(labelUpdateRequestLabelsInner3.equals(labelUpdateRequestLabelsInner4));
        System.assert(labelUpdateRequestLabelsInner4.equals(labelUpdateRequestLabelsInner3));
        System.assert(labelUpdateRequestLabelsInner3.equals(labelUpdateRequestLabelsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner3 = new OASLabelUpdateRequestLabelsInner();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner4 = new OASLabelUpdateRequestLabelsInner();

        System.assert(labelUpdateRequestLabelsInner1.equals(labelUpdateRequestLabelsInner2));
        System.assert(labelUpdateRequestLabelsInner2.equals(labelUpdateRequestLabelsInner1));
        System.assert(labelUpdateRequestLabelsInner3.equals(labelUpdateRequestLabelsInner4));
        System.assert(labelUpdateRequestLabelsInner4.equals(labelUpdateRequestLabelsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = new OASLabelUpdateRequestLabelsInner();

        System.assertEquals(false, labelUpdateRequestLabelsInner1.equals('foo'));
        System.assertEquals(false, labelUpdateRequestLabelsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = new OASLabelUpdateRequestLabelsInner();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner3;

        System.assertEquals(false, labelUpdateRequestLabelsInner1.equals(labelUpdateRequestLabelsInner3));
        System.assertEquals(false, labelUpdateRequestLabelsInner2.equals(labelUpdateRequestLabelsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = new OASLabelUpdateRequestLabelsInner();

        System.assertEquals(labelUpdateRequestLabelsInner1.hashCode(), labelUpdateRequestLabelsInner1.hashCode());
        System.assertEquals(labelUpdateRequestLabelsInner2.hashCode(), labelUpdateRequestLabelsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner1 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner2 = OASLabelUpdateRequestLabelsInner.getExample();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner3 = new OASLabelUpdateRequestLabelsInner();
        OASLabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner4 = new OASLabelUpdateRequestLabelsInner();

        System.assert(labelUpdateRequestLabelsInner1.equals(labelUpdateRequestLabelsInner2));
        System.assert(labelUpdateRequestLabelsInner3.equals(labelUpdateRequestLabelsInner4));
        System.assertEquals(labelUpdateRequestLabelsInner1.hashCode(), labelUpdateRequestLabelsInner2.hashCode());
        System.assertEquals(labelUpdateRequestLabelsInner3.hashCode(), labelUpdateRequestLabelsInner4.hashCode());
    }
}
