//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/billing_invoice.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoices_get200_response.g.dart';

/// BillingInvoicesGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BillingInvoicesGet200Response implements Built<BillingInvoicesGet200Response, BillingInvoicesGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<BillingInvoice> get items;

  BillingInvoicesGet200Response._();

  factory BillingInvoicesGet200Response([void updates(BillingInvoicesGet200ResponseBuilder b)]) = _$BillingInvoicesGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingInvoicesGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingInvoicesGet200Response> get serializer => _$BillingInvoicesGet200ResponseSerializer();
}

class _$BillingInvoicesGet200ResponseSerializer implements PrimitiveSerializer<BillingInvoicesGet200Response> {
  @override
  final Iterable<Type> types = const [BillingInvoicesGet200Response, _$BillingInvoicesGet200Response];

  @override
  final String wireName = r'BillingInvoicesGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingInvoicesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(BillingInvoice)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingInvoicesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingInvoicesGet200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BillingInvoice)]),
          ) as BuiltList<BillingInvoice>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BillingInvoicesGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingInvoicesGet200ResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

