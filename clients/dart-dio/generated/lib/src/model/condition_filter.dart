//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'condition_filter.g.dart';

/// ConditionFilter
///
/// Properties:
/// * [CONDITION] 
@BuiltValue()
abstract class ConditionFilter implements Built<ConditionFilter, ConditionFilterBuilder> {
  @BuiltValueField(wireName: r'CONDITION')
  CatalogsProductGroupMultipleStringCriteria get CONDITION;

  ConditionFilter._();

  factory ConditionFilter([void updates(ConditionFilterBuilder b)]) = _$ConditionFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConditionFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConditionFilter> get serializer => _$ConditionFilterSerializer();
}

class _$ConditionFilterSerializer implements PrimitiveSerializer<ConditionFilter> {
  @override
  final Iterable<Type> types = const [ConditionFilter, _$ConditionFilter];

  @override
  final String wireName = r'ConditionFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConditionFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CONDITION';
    yield serializers.serialize(
      object.CONDITION,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConditionFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConditionFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CONDITION':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.CONDITION = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConditionFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConditionFilterBuilder();
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

