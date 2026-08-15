//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_label3_filter.g.dart';

/// CustomLabel3Filter
///
/// Properties:
/// * [cUSTOMLABEL3] 
@BuiltValue()
abstract class CustomLabel3Filter implements Built<CustomLabel3Filter, CustomLabel3FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_LABEL_3')
  CatalogsProductGroupFilterOperatorTypeCriteria get cUSTOMLABEL3;

  CustomLabel3Filter._();

  factory CustomLabel3Filter([void updates(CustomLabel3FilterBuilder b)]) = _$CustomLabel3Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomLabel3FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomLabel3Filter> get serializer => _$CustomLabel3FilterSerializer();
}

class _$CustomLabel3FilterSerializer implements PrimitiveSerializer<CustomLabel3Filter> {
  @override
  final Iterable<Type> types = const [CustomLabel3Filter, _$CustomLabel3Filter];

  @override
  final String wireName = r'CustomLabel3Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomLabel3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_LABEL_3';
    yield serializers.serialize(
      object.cUSTOMLABEL3,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomLabel3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomLabel3FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_LABEL_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.cUSTOMLABEL3 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomLabel3Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomLabel3FilterBuilder();
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

