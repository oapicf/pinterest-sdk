//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_item_validation_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_item_validation_errors.g.dart';

/// CatalogsItemValidationErrors
///
/// Properties:
/// * [ADULT_INVALID] 
/// * [ADWORDS_FORMAT_INVALID] 
/// * [AVAILABILITY_INVALID] 
/// * [BLOCKLISTED_IMAGE_SIGNATURE] 
/// * [DESCRIPTION_MISSING] 
/// * [DUPLICATE_PRODUCTS] 
/// * [IMAGE_LINK_INVALID] 
/// * [IMAGE_LINK_LENGTH_TOO_LONG] 
/// * [IMAGE_LINK_MISSING] 
/// * [INVALID_DOMAIN] 
/// * [ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE] 
/// * [ITEMID_MISSING] 
/// * [LINK_FORMAT_INVALID] 
/// * [LINK_LENGTH_TOO_LONG] 
/// * [LIST_PRICE_INVALID] 
/// * [MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED] 
/// * [PARSE_LINE_ERROR] 
/// * [PINJOIN_CONTENT_UNSAFE] 
/// * [PRICE_CANNOT_BE_DETERMINED] 
/// * [PRICE_MISSING] 
/// * [PRODUCT_LINK_MISSING] 
/// * [PRODUCT_PRICE_INVALID] 
/// * [TITLE_MISSING] 
@BuiltValue()
abstract class CatalogsItemValidationErrors implements Built<CatalogsItemValidationErrors, CatalogsItemValidationErrorsBuilder> {
  @BuiltValueField(wireName: r'ADULT_INVALID')
  CatalogsItemValidationDetails? get ADULT_INVALID;

  @BuiltValueField(wireName: r'ADWORDS_FORMAT_INVALID')
  CatalogsItemValidationDetails? get ADWORDS_FORMAT_INVALID;

  @BuiltValueField(wireName: r'AVAILABILITY_INVALID')
  CatalogsItemValidationDetails? get AVAILABILITY_INVALID;

  @BuiltValueField(wireName: r'BLOCKLISTED_IMAGE_SIGNATURE')
  CatalogsItemValidationDetails? get BLOCKLISTED_IMAGE_SIGNATURE;

  @BuiltValueField(wireName: r'DESCRIPTION_MISSING')
  CatalogsItemValidationDetails? get DESCRIPTION_MISSING;

  @BuiltValueField(wireName: r'DUPLICATE_PRODUCTS')
  CatalogsItemValidationDetails? get DUPLICATE_PRODUCTS;

  @BuiltValueField(wireName: r'IMAGE_LINK_INVALID')
  CatalogsItemValidationDetails? get IMAGE_LINK_INVALID;

  @BuiltValueField(wireName: r'IMAGE_LINK_LENGTH_TOO_LONG')
  CatalogsItemValidationDetails? get IMAGE_LINK_LENGTH_TOO_LONG;

  @BuiltValueField(wireName: r'IMAGE_LINK_MISSING')
  CatalogsItemValidationDetails? get IMAGE_LINK_MISSING;

  @BuiltValueField(wireName: r'INVALID_DOMAIN')
  CatalogsItemValidationDetails? get INVALID_DOMAIN;

  @BuiltValueField(wireName: r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE')
  CatalogsItemValidationDetails? get ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  @BuiltValueField(wireName: r'ITEMID_MISSING')
  CatalogsItemValidationDetails? get ITEMID_MISSING;

  @BuiltValueField(wireName: r'LINK_FORMAT_INVALID')
  CatalogsItemValidationDetails? get LINK_FORMAT_INVALID;

  @BuiltValueField(wireName: r'LINK_LENGTH_TOO_LONG')
  CatalogsItemValidationDetails? get LINK_LENGTH_TOO_LONG;

  @BuiltValueField(wireName: r'LIST_PRICE_INVALID')
  CatalogsItemValidationDetails? get LIST_PRICE_INVALID;

  @BuiltValueField(wireName: r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED')
  CatalogsItemValidationDetails? get MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  @BuiltValueField(wireName: r'PARSE_LINE_ERROR')
  CatalogsItemValidationDetails? get PARSE_LINE_ERROR;

  @BuiltValueField(wireName: r'PINJOIN_CONTENT_UNSAFE')
  CatalogsItemValidationDetails? get PINJOIN_CONTENT_UNSAFE;

  @BuiltValueField(wireName: r'PRICE_CANNOT_BE_DETERMINED')
  CatalogsItemValidationDetails? get PRICE_CANNOT_BE_DETERMINED;

  @BuiltValueField(wireName: r'PRICE_MISSING')
  CatalogsItemValidationDetails? get PRICE_MISSING;

  @BuiltValueField(wireName: r'PRODUCT_LINK_MISSING')
  CatalogsItemValidationDetails? get PRODUCT_LINK_MISSING;

  @BuiltValueField(wireName: r'PRODUCT_PRICE_INVALID')
  CatalogsItemValidationDetails? get PRODUCT_PRICE_INVALID;

  @BuiltValueField(wireName: r'TITLE_MISSING')
  CatalogsItemValidationDetails? get TITLE_MISSING;

  CatalogsItemValidationErrors._();

  factory CatalogsItemValidationErrors([void updates(CatalogsItemValidationErrorsBuilder b)]) = _$CatalogsItemValidationErrors;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemValidationErrorsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemValidationErrors> get serializer => _$CatalogsItemValidationErrorsSerializer();
}

class _$CatalogsItemValidationErrorsSerializer implements PrimitiveSerializer<CatalogsItemValidationErrors> {
  @override
  final Iterable<Type> types = const [CatalogsItemValidationErrors, _$CatalogsItemValidationErrors];

  @override
  final String wireName = r'CatalogsItemValidationErrors';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemValidationErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ADULT_INVALID != null) {
      yield r'ADULT_INVALID';
      yield serializers.serialize(
        object.ADULT_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.ADWORDS_FORMAT_INVALID != null) {
      yield r'ADWORDS_FORMAT_INVALID';
      yield serializers.serialize(
        object.ADWORDS_FORMAT_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.AVAILABILITY_INVALID != null) {
      yield r'AVAILABILITY_INVALID';
      yield serializers.serialize(
        object.AVAILABILITY_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.BLOCKLISTED_IMAGE_SIGNATURE != null) {
      yield r'BLOCKLISTED_IMAGE_SIGNATURE';
      yield serializers.serialize(
        object.BLOCKLISTED_IMAGE_SIGNATURE,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.DESCRIPTION_MISSING != null) {
      yield r'DESCRIPTION_MISSING';
      yield serializers.serialize(
        object.DESCRIPTION_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.DUPLICATE_PRODUCTS != null) {
      yield r'DUPLICATE_PRODUCTS';
      yield serializers.serialize(
        object.DUPLICATE_PRODUCTS,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.IMAGE_LINK_INVALID != null) {
      yield r'IMAGE_LINK_INVALID';
      yield serializers.serialize(
        object.IMAGE_LINK_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.IMAGE_LINK_LENGTH_TOO_LONG != null) {
      yield r'IMAGE_LINK_LENGTH_TOO_LONG';
      yield serializers.serialize(
        object.IMAGE_LINK_LENGTH_TOO_LONG,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.IMAGE_LINK_MISSING != null) {
      yield r'IMAGE_LINK_MISSING';
      yield serializers.serialize(
        object.IMAGE_LINK_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.INVALID_DOMAIN != null) {
      yield r'INVALID_DOMAIN';
      yield serializers.serialize(
        object.INVALID_DOMAIN,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE != null) {
      yield r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE';
      yield serializers.serialize(
        object.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.ITEMID_MISSING != null) {
      yield r'ITEMID_MISSING';
      yield serializers.serialize(
        object.ITEMID_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.LINK_FORMAT_INVALID != null) {
      yield r'LINK_FORMAT_INVALID';
      yield serializers.serialize(
        object.LINK_FORMAT_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.LINK_LENGTH_TOO_LONG != null) {
      yield r'LINK_LENGTH_TOO_LONG';
      yield serializers.serialize(
        object.LINK_LENGTH_TOO_LONG,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.LIST_PRICE_INVALID != null) {
      yield r'LIST_PRICE_INVALID';
      yield serializers.serialize(
        object.LIST_PRICE_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED != null) {
      yield r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED';
      yield serializers.serialize(
        object.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PARSE_LINE_ERROR != null) {
      yield r'PARSE_LINE_ERROR';
      yield serializers.serialize(
        object.PARSE_LINE_ERROR,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PINJOIN_CONTENT_UNSAFE != null) {
      yield r'PINJOIN_CONTENT_UNSAFE';
      yield serializers.serialize(
        object.PINJOIN_CONTENT_UNSAFE,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PRICE_CANNOT_BE_DETERMINED != null) {
      yield r'PRICE_CANNOT_BE_DETERMINED';
      yield serializers.serialize(
        object.PRICE_CANNOT_BE_DETERMINED,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PRICE_MISSING != null) {
      yield r'PRICE_MISSING';
      yield serializers.serialize(
        object.PRICE_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PRODUCT_LINK_MISSING != null) {
      yield r'PRODUCT_LINK_MISSING';
      yield serializers.serialize(
        object.PRODUCT_LINK_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.PRODUCT_PRICE_INVALID != null) {
      yield r'PRODUCT_PRICE_INVALID';
      yield serializers.serialize(
        object.PRODUCT_PRICE_INVALID,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
    if (object.TITLE_MISSING != null) {
      yield r'TITLE_MISSING';
      yield serializers.serialize(
        object.TITLE_MISSING,
        specifiedType: const FullType(CatalogsItemValidationDetails),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemValidationErrors object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsItemValidationErrorsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ADULT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.ADULT_INVALID.replace(valueDes);
          break;
        case r'ADWORDS_FORMAT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.ADWORDS_FORMAT_INVALID.replace(valueDes);
          break;
        case r'AVAILABILITY_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.AVAILABILITY_INVALID.replace(valueDes);
          break;
        case r'BLOCKLISTED_IMAGE_SIGNATURE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.BLOCKLISTED_IMAGE_SIGNATURE.replace(valueDes);
          break;
        case r'DESCRIPTION_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.DESCRIPTION_MISSING.replace(valueDes);
          break;
        case r'DUPLICATE_PRODUCTS':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.DUPLICATE_PRODUCTS.replace(valueDes);
          break;
        case r'IMAGE_LINK_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.IMAGE_LINK_INVALID.replace(valueDes);
          break;
        case r'IMAGE_LINK_LENGTH_TOO_LONG':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.IMAGE_LINK_LENGTH_TOO_LONG.replace(valueDes);
          break;
        case r'IMAGE_LINK_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.IMAGE_LINK_MISSING.replace(valueDes);
          break;
        case r'INVALID_DOMAIN':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.INVALID_DOMAIN.replace(valueDes);
          break;
        case r'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE.replace(valueDes);
          break;
        case r'ITEMID_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.ITEMID_MISSING.replace(valueDes);
          break;
        case r'LINK_FORMAT_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.LINK_FORMAT_INVALID.replace(valueDes);
          break;
        case r'LINK_LENGTH_TOO_LONG':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.LINK_LENGTH_TOO_LONG.replace(valueDes);
          break;
        case r'LIST_PRICE_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.LIST_PRICE_INVALID.replace(valueDes);
          break;
        case r'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED.replace(valueDes);
          break;
        case r'PARSE_LINE_ERROR':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PARSE_LINE_ERROR.replace(valueDes);
          break;
        case r'PINJOIN_CONTENT_UNSAFE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PINJOIN_CONTENT_UNSAFE.replace(valueDes);
          break;
        case r'PRICE_CANNOT_BE_DETERMINED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PRICE_CANNOT_BE_DETERMINED.replace(valueDes);
          break;
        case r'PRICE_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PRICE_MISSING.replace(valueDes);
          break;
        case r'PRODUCT_LINK_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PRODUCT_LINK_MISSING.replace(valueDes);
          break;
        case r'PRODUCT_PRICE_INVALID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.PRODUCT_PRICE_INVALID.replace(valueDes);
          break;
        case r'TITLE_MISSING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationDetails),
          ) as CatalogsItemValidationDetails;
          result.TITLE_MISSING.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsItemValidationErrors deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemValidationErrorsBuilder();
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

