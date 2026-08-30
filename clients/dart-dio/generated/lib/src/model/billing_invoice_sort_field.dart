//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoice_sort_field.g.dart';

class BillingInvoiceSortField extends EnumClass {

  /// Field by which to sort billing invoices.
  @BuiltValueEnumConst(wireName: r'DUE_DATE')
  static const BillingInvoiceSortField DUE_DATE = _$DUE_DATE;
  /// Field by which to sort billing invoices.
  @BuiltValueEnumConst(wireName: r'BILLING_PERIOD')
  static const BillingInvoiceSortField BILLING_PERIOD = _$BILLING_PERIOD;
  /// Field by which to sort billing invoices.
  @BuiltValueEnumConst(wireName: r'DOCUMENT_TYPE')
  static const BillingInvoiceSortField DOCUMENT_TYPE = _$DOCUMENT_TYPE;
  /// Field by which to sort billing invoices.
  @BuiltValueEnumConst(wireName: r'TOTAL_AMOUNT')
  static const BillingInvoiceSortField TOTAL_AMOUNT = _$TOTAL_AMOUNT;
  /// Field by which to sort billing invoices.
  @BuiltValueEnumConst(wireName: r'INVOICE_NUMBER')
  static const BillingInvoiceSortField INVOICE_NUMBER = _$INVOICE_NUMBER;

  static Serializer<BillingInvoiceSortField> get serializer => _$billingInvoiceSortFieldSerializer;

  const BillingInvoiceSortField._(String name): super(name);

  static BuiltSet<BillingInvoiceSortField> get values => _$values;
  static BillingInvoiceSortField valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingInvoiceSortFieldMixin = Object with _$BillingInvoiceSortFieldMixin;

