//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_number2_filter.g.dart';

/// CustomNumber2Filter
///
/// Properties:
/// * [cUSTOMNUMBER2] 
@BuiltValue()
abstract class CustomNumber2Filter implements Built<CustomNumber2Filter, CustomNumber2FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_NUMBER_2')
  CatalogsProductGroupUint32Criteria get cUSTOMNUMBER2;

  CustomNumber2Filter._();

  factory CustomNumber2Filter([void updates(CustomNumber2FilterBuilder b)]) = _$CustomNumber2Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomNumber2FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomNumber2Filter> get serializer => _$CustomNumber2FilterSerializer();
}

class _$CustomNumber2FilterSerializer implements PrimitiveSerializer<CustomNumber2Filter> {
  @override
  final Iterable<Type> types = const [CustomNumber2Filter, _$CustomNumber2Filter];

  @override
  final String wireName = r'CustomNumber2Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomNumber2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_NUMBER_2';
    yield serializers.serialize(
      object.cUSTOMNUMBER2,
      specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomNumber2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomNumber2FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_NUMBER_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
          ) as CatalogsProductGroupUint32Criteria;
          result.cUSTOMNUMBER2 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomNumber2Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomNumber2FilterBuilder();
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

