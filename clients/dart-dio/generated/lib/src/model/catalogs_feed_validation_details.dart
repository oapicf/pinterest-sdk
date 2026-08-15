//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_validation_warnings.dart';
import 'package:openapi/src/model/catalogs_feed_validation_errors.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_validation_details.g.dart';

/// CatalogsFeedValidationDetails
///
/// Properties:
/// * [errors] 
/// * [warnings] 
@BuiltValue()
abstract class CatalogsFeedValidationDetails implements Built<CatalogsFeedValidationDetails, CatalogsFeedValidationDetailsBuilder> {
  @BuiltValueField(wireName: r'errors')
  CatalogsFeedValidationErrors get errors;

  @BuiltValueField(wireName: r'warnings')
  CatalogsFeedValidationWarnings get warnings;

  CatalogsFeedValidationDetails._();

  factory CatalogsFeedValidationDetails([void updates(CatalogsFeedValidationDetailsBuilder b)]) = _$CatalogsFeedValidationDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedValidationDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedValidationDetails> get serializer => _$CatalogsFeedValidationDetailsSerializer();
}

class _$CatalogsFeedValidationDetailsSerializer implements PrimitiveSerializer<CatalogsFeedValidationDetails> {
  @override
  final Iterable<Type> types = const [CatalogsFeedValidationDetails, _$CatalogsFeedValidationDetails];

  @override
  final String wireName = r'CatalogsFeedValidationDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedValidationDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(CatalogsFeedValidationErrors),
    );
    yield r'warnings';
    yield serializers.serialize(
      object.warnings,
      specifiedType: const FullType(CatalogsFeedValidationWarnings),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedValidationDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedValidationDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedValidationErrors),
          ) as CatalogsFeedValidationErrors;
          result.errors.replace(valueDes);
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedValidationWarnings),
          ) as CatalogsFeedValidationWarnings;
          result.warnings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedValidationDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedValidationDetailsBuilder();
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

