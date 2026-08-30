//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/media_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_filter_values_map.g.dart';

/// A map of filter attributes to their available values.
///
/// Properties:
/// * [customLabel0] 
/// * [customLabel1] 
/// * [customLabel2] 
/// * [customLabel3] 
/// * [customLabel4] 
/// * [googleProductCategory0] 
/// * [googleProductCategory1] 
/// * [googleProductCategory2] 
/// * [googleProductCategory3] 
/// * [googleProductCategory4] 
/// * [googleProductCategory5] 
/// * [googleProductCategory6] 
/// * [mediaType] 
@BuiltValue()
abstract class CatalogsCreativeAssetsFilterValuesMap implements Built<CatalogsCreativeAssetsFilterValuesMap, CatalogsCreativeAssetsFilterValuesMapBuilder> {
  @BuiltValueField(wireName: r'custom_label_0')
  BuiltList<String>? get customLabel0;

  @BuiltValueField(wireName: r'custom_label_1')
  BuiltList<String>? get customLabel1;

  @BuiltValueField(wireName: r'custom_label_2')
  BuiltList<String>? get customLabel2;

  @BuiltValueField(wireName: r'custom_label_3')
  BuiltList<String>? get customLabel3;

  @BuiltValueField(wireName: r'custom_label_4')
  BuiltList<String>? get customLabel4;

  @BuiltValueField(wireName: r'google_product_category_0')
  BuiltList<String>? get googleProductCategory0;

  @BuiltValueField(wireName: r'google_product_category_1')
  BuiltList<String>? get googleProductCategory1;

  @BuiltValueField(wireName: r'google_product_category_2')
  BuiltList<String>? get googleProductCategory2;

  @BuiltValueField(wireName: r'google_product_category_3')
  BuiltList<String>? get googleProductCategory3;

  @BuiltValueField(wireName: r'google_product_category_4')
  BuiltList<String>? get googleProductCategory4;

  @BuiltValueField(wireName: r'google_product_category_5')
  BuiltList<String>? get googleProductCategory5;

  @BuiltValueField(wireName: r'google_product_category_6')
  BuiltList<String>? get googleProductCategory6;

  @BuiltValueField(wireName: r'media_type')
  BuiltList<MediaType>? get mediaType;

  CatalogsCreativeAssetsFilterValuesMap._();

  factory CatalogsCreativeAssetsFilterValuesMap([void updates(CatalogsCreativeAssetsFilterValuesMapBuilder b)]) = _$CatalogsCreativeAssetsFilterValuesMap;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsFilterValuesMapBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsFilterValuesMap> get serializer => _$CatalogsCreativeAssetsFilterValuesMapSerializer();
}

class _$CatalogsCreativeAssetsFilterValuesMapSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsFilterValuesMap> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsFilterValuesMap, _$CatalogsCreativeAssetsFilterValuesMap];

  @override
  final String wireName = r'CatalogsCreativeAssetsFilterValuesMap';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.customLabel0 != null) {
      yield r'custom_label_0';
      yield serializers.serialize(
        object.customLabel0,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel1 != null) {
      yield r'custom_label_1';
      yield serializers.serialize(
        object.customLabel1,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel3 != null) {
      yield r'custom_label_3';
      yield serializers.serialize(
        object.customLabel3,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel4 != null) {
      yield r'custom_label_4';
      yield serializers.serialize(
        object.customLabel4,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory0 != null) {
      yield r'google_product_category_0';
      yield serializers.serialize(
        object.googleProductCategory0,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory1 != null) {
      yield r'google_product_category_1';
      yield serializers.serialize(
        object.googleProductCategory1,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory2 != null) {
      yield r'google_product_category_2';
      yield serializers.serialize(
        object.googleProductCategory2,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory3 != null) {
      yield r'google_product_category_3';
      yield serializers.serialize(
        object.googleProductCategory3,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory4 != null) {
      yield r'google_product_category_4';
      yield serializers.serialize(
        object.googleProductCategory4,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory5 != null) {
      yield r'google_product_category_5';
      yield serializers.serialize(
        object.googleProductCategory5,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.googleProductCategory6 != null) {
      yield r'google_product_category_6';
      yield serializers.serialize(
        object.googleProductCategory6,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.mediaType != null) {
      yield r'media_type';
      yield serializers.serialize(
        object.mediaType,
        specifiedType: const FullType(BuiltList, [FullType(MediaType)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsFilterValuesMapBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel0.replace(valueDes);
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel1.replace(valueDes);
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel2.replace(valueDes);
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel3.replace(valueDes);
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel4.replace(valueDes);
          break;
        case r'google_product_category_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory0.replace(valueDes);
          break;
        case r'google_product_category_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory1.replace(valueDes);
          break;
        case r'google_product_category_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory2.replace(valueDes);
          break;
        case r'google_product_category_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory3.replace(valueDes);
          break;
        case r'google_product_category_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory4.replace(valueDes);
          break;
        case r'google_product_category_5':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory5.replace(valueDes);
          break;
        case r'google_product_category_6':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.googleProductCategory6.replace(valueDes);
          break;
        case r'media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(MediaType)]),
          ) as BuiltList<MediaType>?;
          if (valueDes == null) continue;
          result.mediaType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsFilterValuesMap deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsFilterValuesMapBuilder();
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

