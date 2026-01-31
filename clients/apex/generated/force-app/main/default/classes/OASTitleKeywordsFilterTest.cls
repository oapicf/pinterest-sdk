@isTest
private class OASTitleKeywordsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = titleKeywordsFilter1;
        OASTitleKeywordsFilter titleKeywordsFilter3 = new OASTitleKeywordsFilter();
        OASTitleKeywordsFilter titleKeywordsFilter4 = titleKeywordsFilter3;

        System.assert(titleKeywordsFilter1.equals(titleKeywordsFilter2));
        System.assert(titleKeywordsFilter2.equals(titleKeywordsFilter1));
        System.assert(titleKeywordsFilter1.equals(titleKeywordsFilter1));
        System.assert(titleKeywordsFilter3.equals(titleKeywordsFilter4));
        System.assert(titleKeywordsFilter4.equals(titleKeywordsFilter3));
        System.assert(titleKeywordsFilter3.equals(titleKeywordsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter3 = new OASTitleKeywordsFilter();
        OASTitleKeywordsFilter titleKeywordsFilter4 = new OASTitleKeywordsFilter();

        System.assert(titleKeywordsFilter1.equals(titleKeywordsFilter2));
        System.assert(titleKeywordsFilter2.equals(titleKeywordsFilter1));
        System.assert(titleKeywordsFilter3.equals(titleKeywordsFilter4));
        System.assert(titleKeywordsFilter4.equals(titleKeywordsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = new OASTitleKeywordsFilter();

        System.assertEquals(false, titleKeywordsFilter1.equals('foo'));
        System.assertEquals(false, titleKeywordsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = new OASTitleKeywordsFilter();
        OASTitleKeywordsFilter titleKeywordsFilter3;

        System.assertEquals(false, titleKeywordsFilter1.equals(titleKeywordsFilter3));
        System.assertEquals(false, titleKeywordsFilter2.equals(titleKeywordsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = new OASTitleKeywordsFilter();

        System.assertEquals(titleKeywordsFilter1.hashCode(), titleKeywordsFilter1.hashCode());
        System.assertEquals(titleKeywordsFilter2.hashCode(), titleKeywordsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTitleKeywordsFilter titleKeywordsFilter1 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter2 = OASTitleKeywordsFilter.getExample();
        OASTitleKeywordsFilter titleKeywordsFilter3 = new OASTitleKeywordsFilter();
        OASTitleKeywordsFilter titleKeywordsFilter4 = new OASTitleKeywordsFilter();

        System.assert(titleKeywordsFilter1.equals(titleKeywordsFilter2));
        System.assert(titleKeywordsFilter3.equals(titleKeywordsFilter4));
        System.assertEquals(titleKeywordsFilter1.hashCode(), titleKeywordsFilter2.hashCode());
        System.assertEquals(titleKeywordsFilter3.hashCode(), titleKeywordsFilter4.hashCode());
    }
}
