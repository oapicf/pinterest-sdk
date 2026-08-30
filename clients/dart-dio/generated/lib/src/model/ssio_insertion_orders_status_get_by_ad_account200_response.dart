//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ssio_insertion_order_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_orders_status_get_by_ad_account200_response.g.dart';

/// SsioInsertionOrdersStatusGetByAdAccount200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class SsioInsertionOrdersStatusGetByAdAccount200Response implements Built<SsioInsertionOrdersStatusGetByAdAccount200Response, SsioInsertionOrdersStatusGetByAdAccount200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<SSIOInsertionOrderStatus> get items;

  SsioInsertionOrdersStatusGetByAdAccount200Response._();

  factory SsioInsertionOrdersStatusGetByAdAccount200Response([void updates(SsioInsertionOrdersStatusGetByAdAccount200ResponseBuilder b)]) = _$SsioInsertionOrdersStatusGetByAdAccount200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SsioInsertionOrdersStatusGetByAdAccount200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SsioInsertionOrdersStatusGetByAdAccount200Response> get serializer => _$SsioInsertionOrdersStatusGetByAdAccount200ResponseSerializer();
}

class _$SsioInsertionOrdersStatusGetByAdAccount200ResponseSerializer implements PrimitiveSerializer<SsioInsertionOrdersStatusGetByAdAccount200Response> {
  @override
  final Iterable<Type> types = const [SsioInsertionOrdersStatusGetByAdAccount200Response, _$SsioInsertionOrdersStatusGetByAdAccount200Response];

  @override
  final String wireName = r'SsioInsertionOrdersStatusGetByAdAccount200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SsioInsertionOrdersStatusGetByAdAccount200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(SSIOInsertionOrderStatus)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SsioInsertionOrdersStatusGetByAdAccount200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SsioInsertionOrdersStatusGetByAdAccount200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(SSIOInsertionOrderStatus)]),
          ) as BuiltList<SSIOInsertionOrderStatus>;
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
  SsioInsertionOrdersStatusGetByAdAccount200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SsioInsertionOrdersStatusGetByAdAccount200ResponseBuilder();
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

