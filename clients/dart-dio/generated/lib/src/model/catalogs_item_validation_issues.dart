//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_item_validation_errors.dart';
import 'package:openapi/src/model/catalogs_item_validation_warnings.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_item_validation_issues.g.dart';

/// CatalogsItemValidationIssues
///
/// Properties:
/// * [errors] 
/// * [itemId] - The merchant-created unique ID that represents the product.
/// * [itemNumber] - Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
/// * [warnings] 
@BuiltValue()
abstract class CatalogsItemValidationIssues implements Built<CatalogsItemValidationIssues, CatalogsItemValidationIssuesBuilder> {
  @BuiltValueField(wireName: r'errors')
  CatalogsItemValidationErrors get errors;

  /// The merchant-created unique ID that represents the product.
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  /// Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  @BuiltValueField(wireName: r'item_number')
  int get itemNumber;

  @BuiltValueField(wireName: r'warnings')
  CatalogsItemValidationWarnings get warnings;

  CatalogsItemValidationIssues._();

  factory CatalogsItemValidationIssues([void updates(CatalogsItemValidationIssuesBuilder b)]) = _$CatalogsItemValidationIssues;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemValidationIssuesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemValidationIssues> get serializer => _$CatalogsItemValidationIssuesSerializer();
}

class _$CatalogsItemValidationIssuesSerializer implements PrimitiveSerializer<CatalogsItemValidationIssues> {
  @override
  final Iterable<Type> types = const [CatalogsItemValidationIssues, _$CatalogsItemValidationIssues];

  @override
  final String wireName = r'CatalogsItemValidationIssues';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemValidationIssues object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(CatalogsItemValidationErrors),
    );
    yield r'item_id';
    yield object.itemId == null ? null : serializers.serialize(
      object.itemId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'item_number';
    yield serializers.serialize(
      object.itemNumber,
      specifiedType: const FullType(int),
    );
    yield r'warnings';
    yield serializers.serialize(
      object.warnings,
      specifiedType: const FullType(CatalogsItemValidationWarnings),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemValidationIssues object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsItemValidationIssuesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationErrors),
          ) as CatalogsItemValidationErrors;
          result.errors.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemId = valueDes;
          break;
        case r'item_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.itemNumber = valueDes;
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsItemValidationWarnings),
          ) as CatalogsItemValidationWarnings;
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
  CatalogsItemValidationIssues deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemValidationIssuesBuilder();
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

