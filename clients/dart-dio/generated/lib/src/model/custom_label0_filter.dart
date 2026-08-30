//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_label0_filter.g.dart';

/// CustomLabel0Filter
///
/// Properties:
/// * [CUSTOM_LABEL_0] 
@BuiltValue()
abstract class CustomLabel0Filter implements Built<CustomLabel0Filter, CustomLabel0FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_LABEL_0')
  CatalogsProductGroupFilterOperatorTypeCriteria get CUSTOM_LABEL_0;

  CustomLabel0Filter._();

  factory CustomLabel0Filter([void updates(CustomLabel0FilterBuilder b)]) = _$CustomLabel0Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomLabel0FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomLabel0Filter> get serializer => _$CustomLabel0FilterSerializer();
}

class _$CustomLabel0FilterSerializer implements PrimitiveSerializer<CustomLabel0Filter> {
  @override
  final Iterable<Type> types = const [CustomLabel0Filter, _$CustomLabel0Filter];

  @override
  final String wireName = r'CustomLabel0Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomLabel0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_LABEL_0';
    yield serializers.serialize(
      object.CUSTOM_LABEL_0,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomLabel0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomLabel0FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_LABEL_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.CUSTOM_LABEL_0.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomLabel0Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomLabel0FilterBuilder();
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

