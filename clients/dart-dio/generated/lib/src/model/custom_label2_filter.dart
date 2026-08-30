//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_label2_filter.g.dart';

/// CustomLabel2Filter
///
/// Properties:
/// * [CUSTOM_LABEL_2] 
@BuiltValue()
abstract class CustomLabel2Filter implements Built<CustomLabel2Filter, CustomLabel2FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_LABEL_2')
  CatalogsProductGroupFilterOperatorTypeCriteria get CUSTOM_LABEL_2;

  CustomLabel2Filter._();

  factory CustomLabel2Filter([void updates(CustomLabel2FilterBuilder b)]) = _$CustomLabel2Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomLabel2FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomLabel2Filter> get serializer => _$CustomLabel2FilterSerializer();
}

class _$CustomLabel2FilterSerializer implements PrimitiveSerializer<CustomLabel2Filter> {
  @override
  final Iterable<Type> types = const [CustomLabel2Filter, _$CustomLabel2Filter];

  @override
  final String wireName = r'CustomLabel2Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomLabel2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_LABEL_2';
    yield serializers.serialize(
      object.CUSTOM_LABEL_2,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomLabel2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomLabel2FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_LABEL_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.CUSTOM_LABEL_2.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomLabel2Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomLabel2FilterBuilder();
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

