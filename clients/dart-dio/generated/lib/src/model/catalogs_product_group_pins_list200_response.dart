//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_pins_list200_response.g.dart';

/// CatalogsProductGroupPinsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class CatalogsProductGroupPinsList200Response implements Built<CatalogsProductGroupPinsList200Response, CatalogsProductGroupPinsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<CatalogsProduct> get items;

  CatalogsProductGroupPinsList200Response._();

  factory CatalogsProductGroupPinsList200Response([void updates(CatalogsProductGroupPinsList200ResponseBuilder b)]) = _$CatalogsProductGroupPinsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupPinsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupPinsList200Response> get serializer => _$CatalogsProductGroupPinsList200ResponseSerializer();
}

class _$CatalogsProductGroupPinsList200ResponseSerializer implements PrimitiveSerializer<CatalogsProductGroupPinsList200Response> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupPinsList200Response, _$CatalogsProductGroupPinsList200Response];

  @override
  final String wireName = r'CatalogsProductGroupPinsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupPinsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(CatalogsProduct)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupPinsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupPinsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProduct)]),
          ) as BuiltList<CatalogsProduct>;
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
  CatalogsProductGroupPinsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupPinsList200ResponseBuilder();
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

