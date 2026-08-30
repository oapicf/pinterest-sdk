//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoice_status.g.dart';

class BillingInvoiceStatus extends EnumClass {

  /// The status of a billing invoice.
  @BuiltValueEnumConst(wireName: r'OPEN')
  static const BillingInvoiceStatus OPEN = _$OPEN;
  /// The status of a billing invoice.
  @BuiltValueEnumConst(wireName: r'CLOSED')
  static const BillingInvoiceStatus CLOSED = _$CLOSED;

  static Serializer<BillingInvoiceStatus> get serializer => _$billingInvoiceStatusSerializer;

  const BillingInvoiceStatus._(String name): super(name);

  static BuiltSet<BillingInvoiceStatus> get values => _$values;
  static BillingInvoiceStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingInvoiceStatusMixin = Object with _$BillingInvoiceStatusMixin;

