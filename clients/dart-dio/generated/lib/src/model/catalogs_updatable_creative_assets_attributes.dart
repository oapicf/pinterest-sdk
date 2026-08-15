//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_updatable_creative_assets_attributes.g.dart';

/// CatalogsUpdatableCreativeAssetsAttributes
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
@BuiltValue(instantiable: false)
abstract class CatalogsUpdatableCreativeAssetsAttributes  {
  /// Link to the creative assets page.
  @BuiltValueField(wireName: r'android_deep_link')
  String? get androidDeepLink;

  /// Custom grouping of creative assets.
  @BuiltValueField(wireName: r'custom_label_0')
  String? get customLabel0;

  /// Custom grouping of creative assets.
  @BuiltValueField(wireName: r'custom_label_1')
  String? get customLabel1;

  /// Custom grouping of creative assets.
  @BuiltValueField(wireName: r'custom_label_2')
  String? get customLabel2;

  /// Custom grouping of creative assets.
  @BuiltValueField(wireName: r'custom_label_3')
  String? get customLabel3;

  /// Custom grouping of creative assets.
  @BuiltValueField(wireName: r'custom_label_4')
  String? get customLabel4;

  /// Brief description of the creative assets.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  @BuiltValueField(wireName: r'google_product_category')
  String? get googleProductCategory;

  /// IOS deep link to the creative assets page.
  @BuiltValueField(wireName: r'ios_deep_link')
  String? get iosDeepLink;

  /// Link to the creative assets page.
  @BuiltValueField(wireName: r'link')
  String? get link;

  /// The name of the creative assets.
  @BuiltValueField(wireName: r'title')
  String? get title;

  /// Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  @BuiltValueField(wireName: r'visibility')
  String? get visibility;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpdatableCreativeAssetsAttributes> get serializer => _$CatalogsUpdatableCreativeAssetsAttributesSerializer();
}

class _$CatalogsUpdatableCreativeAssetsAttributesSerializer implements PrimitiveSerializer<CatalogsUpdatableCreativeAssetsAttributes> {
  @override
  final Iterable<Type> types = const [CatalogsUpdatableCreativeAssetsAttributes];

  @override
  final String wireName = r'CatalogsUpdatableCreativeAssetsAttributes';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpdatableCreativeAssetsAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.androidDeepLink != null) {
      yield r'android_deep_link';
      yield serializers.serialize(
        object.androidDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customLabel0 != null) {
      yield r'custom_label_0';
      yield serializers.serialize(
        object.customLabel0,
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
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
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
    if (object.customLabel4 != null) {
      yield r'custom_label_4';
      yield serializers.serialize(
        object.customLabel4,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
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
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
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
    if (object.visibility != null) {
      yield r'visibility';
      yield serializers.serialize(
        object.visibility,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpdatableCreativeAssetsAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CatalogsUpdatableCreativeAssetsAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CatalogsUpdatableCreativeAssetsAttributes)) as $CatalogsUpdatableCreativeAssetsAttributes;
  }
}

/// a concrete implementation of [CatalogsUpdatableCreativeAssetsAttributes], since [CatalogsUpdatableCreativeAssetsAttributes] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CatalogsUpdatableCreativeAssetsAttributes implements CatalogsUpdatableCreativeAssetsAttributes, Built<$CatalogsUpdatableCreativeAssetsAttributes, $CatalogsUpdatableCreativeAssetsAttributesBuilder> {
  $CatalogsUpdatableCreativeAssetsAttributes._();

  factory $CatalogsUpdatableCreativeAssetsAttributes([void Function($CatalogsUpdatableCreativeAssetsAttributesBuilder)? updates]) = _$$CatalogsUpdatableCreativeAssetsAttributes;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CatalogsUpdatableCreativeAssetsAttributesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CatalogsUpdatableCreativeAssetsAttributes> get serializer => _$$CatalogsUpdatableCreativeAssetsAttributesSerializer();
}

class _$$CatalogsUpdatableCreativeAssetsAttributesSerializer implements PrimitiveSerializer<$CatalogsUpdatableCreativeAssetsAttributes> {
  @override
  final Iterable<Type> types = const [$CatalogsUpdatableCreativeAssetsAttributes, _$$CatalogsUpdatableCreativeAssetsAttributes];

  @override
  final String wireName = r'$CatalogsUpdatableCreativeAssetsAttributes';

  @override
  Object serialize(
    Serializers serializers,
    $CatalogsUpdatableCreativeAssetsAttributes object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CatalogsUpdatableCreativeAssetsAttributes))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpdatableCreativeAssetsAttributesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'android_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.androidDeepLink = valueDes;
          break;
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel0 = valueDes;
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel1 = valueDes;
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel2 = valueDes;
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel3 = valueDes;
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customLabel4 = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
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
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.link = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        case r'visibility':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  $CatalogsUpdatableCreativeAssetsAttributes deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CatalogsUpdatableCreativeAssetsAttributesBuilder();
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

