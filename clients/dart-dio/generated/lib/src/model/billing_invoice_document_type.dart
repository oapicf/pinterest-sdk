//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoice_document_type.g.dart';

class BillingInvoiceDocumentType extends EnumClass {

  /// The type of a billing invoice document.
  @BuiltValueEnumConst(wireName: r'INVOICE')
  static const BillingInvoiceDocumentType INVOICE = _$INVOICE;
  /// The type of a billing invoice document.
  @BuiltValueEnumConst(wireName: r'CREDIT_MEMO')
  static const BillingInvoiceDocumentType CREDIT_MEMO = _$CREDIT_MEMO;

  static Serializer<BillingInvoiceDocumentType> get serializer => _$billingInvoiceDocumentTypeSerializer;

  const BillingInvoiceDocumentType._(String name): super(name);

  static BuiltSet<BillingInvoiceDocumentType> get values => _$values;
  static BillingInvoiceDocumentType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingInvoiceDocumentTypeMixin = Object with _$BillingInvoiceDocumentTypeMixin;

