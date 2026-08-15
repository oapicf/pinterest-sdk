//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_label1_filter.g.dart';

/// CustomLabel1Filter
///
/// Properties:
/// * [cUSTOMLABEL1] 
@BuiltValue()
abstract class CustomLabel1Filter implements Built<CustomLabel1Filter, CustomLabel1FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_LABEL_1')
  CatalogsProductGroupFilterOperatorTypeCriteria get cUSTOMLABEL1;

  CustomLabel1Filter._();

  factory CustomLabel1Filter([void updates(CustomLabel1FilterBuilder b)]) = _$CustomLabel1Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomLabel1FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomLabel1Filter> get serializer => _$CustomLabel1FilterSerializer();
}

class _$CustomLabel1FilterSerializer implements PrimitiveSerializer<CustomLabel1Filter> {
  @override
  final Iterable<Type> types = const [CustomLabel1Filter, _$CustomLabel1Filter];

  @override
  final String wireName = r'CustomLabel1Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomLabel1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_LABEL_1';
    yield serializers.serialize(
      object.cUSTOMLABEL1,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomLabel1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomLabel1FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_LABEL_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.cUSTOMLABEL1 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomLabel1Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomLabel1FilterBuilder();
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

