//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/get_partner_assets_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_partner_asset_access_get200_response.g.dart';

/// BusinessPartnerAssetAccessGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - List assets on which you granted access to your partner or assets on which your partner has granted you access.
@BuiltValue()
abstract class BusinessPartnerAssetAccessGet200Response implements Paginated, Built<BusinessPartnerAssetAccessGet200Response, BusinessPartnerAssetAccessGet200ResponseBuilder> {
  BusinessPartnerAssetAccessGet200Response._();

  factory BusinessPartnerAssetAccessGet200Response([void updates(BusinessPartnerAssetAccessGet200ResponseBuilder b)]) = _$BusinessPartnerAssetAccessGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessPartnerAssetAccessGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessPartnerAssetAccessGet200Response> get serializer => _$BusinessPartnerAssetAccessGet200ResponseSerializer();
}

class _$BusinessPartnerAssetAccessGet200ResponseSerializer implements PrimitiveSerializer<BusinessPartnerAssetAccessGet200Response> {
  @override
  final Iterable<Type> types = const [BusinessPartnerAssetAccessGet200Response, _$BusinessPartnerAssetAccessGet200Response];

  @override
  final String wireName = r'BusinessPartnerAssetAccessGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessPartnerAssetAccessGet200Response object, {
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
    BusinessPartnerAssetAccessGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessPartnerAssetAccessGet200ResponseBuilder result,
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
  BusinessPartnerAssetAccessGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessPartnerAssetAccessGet200ResponseBuilder();
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

