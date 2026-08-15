//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/get_business_assets_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_assets_get200_response.g.dart';

/// BusinessAssetsGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - List of assets the requesting business has access to.
@BuiltValue()
abstract class BusinessAssetsGet200Response implements Paginated, Built<BusinessAssetsGet200Response, BusinessAssetsGet200ResponseBuilder> {
  BusinessAssetsGet200Response._();

  factory BusinessAssetsGet200Response([void updates(BusinessAssetsGet200ResponseBuilder b)]) = _$BusinessAssetsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessAssetsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessAssetsGet200Response> get serializer => _$BusinessAssetsGet200ResponseSerializer();
}

class _$BusinessAssetsGet200ResponseSerializer implements PrimitiveSerializer<BusinessAssetsGet200Response> {
  @override
  final Iterable<Type> types = const [BusinessAssetsGet200Response, _$BusinessAssetsGet200Response];

  @override
  final String wireName = r'BusinessAssetsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessAssetsGet200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessAssetsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessAssetsGet200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
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
  BusinessAssetsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessAssetsGet200ResponseBuilder();
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

