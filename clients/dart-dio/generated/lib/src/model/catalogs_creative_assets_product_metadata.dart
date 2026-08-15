//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/creative_assets_visibility_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_metadata.g.dart';

/// Creative assets product metadata entity
///
/// Properties:
/// * [creativeAssetsId] - The user-created unique ID that represents the creative assets item.
/// * [visibility] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductMetadata implements Built<CatalogsCreativeAssetsProductMetadata, CatalogsCreativeAssetsProductMetadataBuilder> {
  /// The user-created unique ID that represents the creative assets item.
  @BuiltValueField(wireName: r'creative_assets_id')
  String get creativeAssetsId;

  @BuiltValueField(wireName: r'visibility')
  CreativeAssetsVisibilityType get visibility;
  // enum visibilityEnum {  VISIBLE,  HIDDEN,  };

  CatalogsCreativeAssetsProductMetadata._();

  factory CatalogsCreativeAssetsProductMetadata([void updates(CatalogsCreativeAssetsProductMetadataBuilder b)]) = _$CatalogsCreativeAssetsProductMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductMetadata> get serializer => _$CatalogsCreativeAssetsProductMetadataSerializer();
}

class _$CatalogsCreativeAssetsProductMetadataSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductMetadata> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductMetadata, _$CatalogsCreativeAssetsProductMetadata];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'creative_assets_id';
    yield serializers.serialize(
      object.creativeAssetsId,
      specifiedType: const FullType(String),
    );
    yield r'visibility';
    yield serializers.serialize(
      object.visibility,
      specifiedType: const FullType(CreativeAssetsVisibilityType),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'creative_assets_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.creativeAssetsId = valueDes;
          break;
        case r'visibility':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreativeAssetsVisibilityType),
          ) as CreativeAssetsVisibilityType;
          result.visibility = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsProductMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductMetadataBuilder();
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

