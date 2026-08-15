//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_label4_filter.g.dart';

/// CustomLabel4Filter
///
/// Properties:
/// * [cUSTOMLABEL4] 
@BuiltValue()
abstract class CustomLabel4Filter implements Built<CustomLabel4Filter, CustomLabel4FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_LABEL_4')
  CatalogsProductGroupFilterOperatorTypeCriteria get cUSTOMLABEL4;

  CustomLabel4Filter._();

  factory CustomLabel4Filter([void updates(CustomLabel4FilterBuilder b)]) = _$CustomLabel4Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomLabel4FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomLabel4Filter> get serializer => _$CustomLabel4FilterSerializer();
}

class _$CustomLabel4FilterSerializer implements PrimitiveSerializer<CustomLabel4Filter> {
  @override
  final Iterable<Type> types = const [CustomLabel4Filter, _$CustomLabel4Filter];

  @override
  final String wireName = r'CustomLabel4Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomLabel4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_LABEL_4';
    yield serializers.serialize(
      object.cUSTOMLABEL4,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomLabel4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomLabel4FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_LABEL_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.cUSTOMLABEL4 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomLabel4Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomLabel4FilterBuilder();
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

