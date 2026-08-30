//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_business_assets.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_partner_asset_access_get200_response.g.dart';

/// BusinessPartnerAssetAccessGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BusinessPartnerAssetAccessGet200Response implements Built<BusinessPartnerAssetAccessGet200Response, BusinessPartnerAssetAccessGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<BaseBusinessAssets> get items;

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
      specifiedType: const FullType(BuiltList, [FullType(BaseBusinessAssets)]),
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
            specifiedType: const FullType(BuiltList, [FullType(BaseBusinessAssets)]),
          ) as BuiltList<BaseBusinessAssets>;
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

