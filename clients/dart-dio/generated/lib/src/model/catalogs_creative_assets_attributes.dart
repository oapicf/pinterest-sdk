//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_updatable_creative_assets_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_attributes.g.dart';

/// CatalogsCreativeAssetsAttributes
///
/// Properties:
/// * [androidDeepLink] - Link to the creative assets page.
/// * [customLabel0] - Custom grouping of creative assets.
/// * [customLabel1] - Custom grouping of creative assets.
/// * [customLabel2] - Custom grouping of creative assets.
/// * [customLabel3] - Custom grouping of creative assets.
/// * [customLabel4] - Custom grouping of creative assets.
/// * [description] - Brief description of the creative assets.
/// * [googleProductCategory] - The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
/// * [iosDeepLink] - IOS deep link to the creative assets page.
/// * [link] - Link to the creative assets page.
/// * [title] - The name of the creative assets.
/// * [visibility] - Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
/// * [imageLink] - The creative assets image.
/// * [videoLink] - The creative assets video.
@BuiltValue()
abstract class CatalogsCreativeAssetsAttributes implements CatalogsUpdatableCreativeAssetsAttributes, Built<CatalogsCreativeAssetsAttributes, CatalogsCreativeAssetsAttributesBuilder> {
  /// The creative assets image.
  @BuiltValueField(wireName: r'image_link')
  String? get imageLink;

  /// The creative assets video.
  @BuiltValueField(wireName: r'video_link')
  String? get videoLink;

  CatalogsCreativeAssetsAttributes._();

  factory CatalogsCreativeAssetsAttributes([void updates(CatalogsCreativeAssetsAttributesBuilder b)]) = _$CatalogsCreativeAssetsAttributes;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsAttributesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsAttributes> get serializer => _$CatalogsCreativeAssetsAttributesSerializer();
}

class _$CatalogsCreativeAssetsAttributesSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsAttributes> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsAttributes, _$CatalogsCreativeAssetsAttributes];

  @override
  final String wireName = r'CatalogsCreativeAssetsAttributes';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.googleProductCategory != null) {
      yield r'google_product_category';
      yield serializers.serialize(
        object.googleProductCategory,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.iosDeepLink != null) {
      yield r'ios_deep_link';
      yield serializers.serialize(
        object.iosDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.visibility != null) {
      yield r'visibility';
      yield serializers.serialize(
        object.visibility,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel4 != null) {
      yield r'custom_label_4';
      yield serializers.serialize(
        object.customLabel4,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel3 != null) {
      yield r'custom_label_3';
      yield serializers.serialize(
        object.customLabel3,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.imageLink != null) {
      yield r'image_link';
      yield serializers.serialize(
        object.imageLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel1 != null) {
      yield r'custom_label_1';
      yield serializers.serialize(
        object.customLabel1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.videoLink != null) {
      yield r'video_link';
      yield serializers.serialize(
        object.videoLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.customLabel0 != null) {
      yield r'custom_label_0';
      yield serializers.serialize(
        object.customLabel0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.androidDeepLink != null) {
      yield r'android_deep_link';
      yield serializers.serialize(
        object.androidDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsAttributesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'google_product_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.googleProductCategory = valueDes;
          break;
        case r'ios_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.iosDeepLink = valueDes;
          break;
        case r'visibility':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.visibility = valueDes;
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel4 = valueDes;
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel3 = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.link = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        case r'image_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.imageLink = valueDes;
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel2 = valueDes;
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel1 = valueDes;
          break;
        case r'video_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.videoLink = valueDes;
          break;
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel0 = valueDes;
          break;
        case r'android_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.androidDeepLink = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsAttributesBuilder();
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

