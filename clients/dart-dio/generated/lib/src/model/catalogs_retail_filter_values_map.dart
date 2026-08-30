//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_availability.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/gender.dart';
import 'package:openapi/src/model/media_type.dart';
import 'package:openapi/src/model/product_condition.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_filter_values_map.g.dart';

/// A map of filter attributes to their available values.
///
/// Properties:
/// * [adImageTags] 
/// * [adVideoTags] 
/// * [availability] 
/// * [brand] 
/// * [condition] 
/// * [customLabel0] 
/// * [customLabel1] 
/// * [customLabel2] 
/// * [customLabel3] 
/// * [customLabel4] 
/// * [gender] 
/// * [googleProductCategory0] 
/// * [googleProductCategory1] 
/// * [googleProductCategory2] 
/// * [googleProductCategory3] 
/// * [googleProductCategory4] 
/// * [googleProductCategory5] 
/// * [googleProductCategory6] 
/// * [mediaType] 
/// * [productType0] 
/// * [productType1] 
/// * [productType2] 
/// * [productType3] 
/// * [productType4] 
@BuiltValue()
abstract class CatalogsRetailFilterValuesMap implements Built<CatalogsRetailFilterValuesMap, CatalogsRetailFilterValuesMapBuilder> {
  @BuiltValueField(wireName: r'ad_image_tags')
  BuiltList<String>? get adImageTags;

  @BuiltValueField(wireName: r'ad_video_tags')
  BuiltList<String>? get adVideoTags;

  @BuiltValueField(wireName: r'availability')
  BuiltList<ProductAvailability>? get availability;

  @BuiltValueField(wireName: r'brand')
  BuiltList<String>? get brand;

  @BuiltValueField(wireName: r'condition')
  BuiltList<ProductCondition>? get condition;

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

  @BuiltValueField(wireName: r'gender')
  BuiltList<Gender>? get gender;

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

  @BuiltValueField(wireName: r'product_type_0')
  BuiltList<String>? get productType0;

  @BuiltValueField(wireName: r'product_type_1')
  BuiltList<String>? get productType1;

  @BuiltValueField(wireName: r'product_type_2')
  BuiltList<String>? get productType2;

  @BuiltValueField(wireName: r'product_type_3')
  BuiltList<String>? get productType3;

  @BuiltValueField(wireName: r'product_type_4')
  BuiltList<String>? get productType4;

  CatalogsRetailFilterValuesMap._();

  factory CatalogsRetailFilterValuesMap([void updates(CatalogsRetailFilterValuesMapBuilder b)]) = _$CatalogsRetailFilterValuesMap;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailFilterValuesMapBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailFilterValuesMap> get serializer => _$CatalogsRetailFilterValuesMapSerializer();
}

class _$CatalogsRetailFilterValuesMapSerializer implements PrimitiveSerializer<CatalogsRetailFilterValuesMap> {
  @override
  final Iterable<Type> types = const [CatalogsRetailFilterValuesMap, _$CatalogsRetailFilterValuesMap];

  @override
  final String wireName = r'CatalogsRetailFilterValuesMap';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adImageTags != null) {
      yield r'ad_image_tags';
      yield serializers.serialize(
        object.adImageTags,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.adVideoTags != null) {
      yield r'ad_video_tags';
      yield serializers.serialize(
        object.adVideoTags,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.availability != null) {
      yield r'availability';
      yield serializers.serialize(
        object.availability,
        specifiedType: const FullType(BuiltList, [FullType(ProductAvailability)]),
      );
    }
    if (object.brand != null) {
      yield r'brand';
      yield serializers.serialize(
        object.brand,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.condition != null) {
      yield r'condition';
      yield serializers.serialize(
        object.condition,
        specifiedType: const FullType(BuiltList, [FullType(ProductCondition)]),
      );
    }
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
    if (object.gender != null) {
      yield r'gender';
      yield serializers.serialize(
        object.gender,
        specifiedType: const FullType(BuiltList, [FullType(Gender)]),
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
    if (object.productType0 != null) {
      yield r'product_type_0';
      yield serializers.serialize(
        object.productType0,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.productType1 != null) {
      yield r'product_type_1';
      yield serializers.serialize(
        object.productType1,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.productType2 != null) {
      yield r'product_type_2';
      yield serializers.serialize(
        object.productType2,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.productType3 != null) {
      yield r'product_type_3';
      yield serializers.serialize(
        object.productType3,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.productType4 != null) {
      yield r'product_type_4';
      yield serializers.serialize(
        object.productType4,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailFilterValuesMapBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_image_tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adImageTags.replace(valueDes);
          break;
        case r'ad_video_tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adVideoTags.replace(valueDes);
          break;
        case r'availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ProductAvailability)]),
          ) as BuiltList<ProductAvailability>?;
          if (valueDes == null) continue;
          result.availability.replace(valueDes);
          break;
        case r'brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.brand.replace(valueDes);
          break;
        case r'condition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ProductCondition)]),
          ) as BuiltList<ProductCondition>?;
          if (valueDes == null) continue;
          result.condition.replace(valueDes);
          break;
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
        case r'gender':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Gender)]),
          ) as BuiltList<Gender>?;
          if (valueDes == null) continue;
          result.gender.replace(valueDes);
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
        case r'product_type_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productType0.replace(valueDes);
          break;
        case r'product_type_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productType1.replace(valueDes);
          break;
        case r'product_type_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productType2.replace(valueDes);
          break;
        case r'product_type_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productType3.replace(valueDes);
          break;
        case r'product_type_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productType4.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailFilterValuesMap deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailFilterValuesMapBuilder();
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

