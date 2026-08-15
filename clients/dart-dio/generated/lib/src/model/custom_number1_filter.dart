//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_number1_filter.g.dart';

/// CustomNumber1Filter
///
/// Properties:
/// * [cUSTOMNUMBER1] 
@BuiltValue()
abstract class CustomNumber1Filter implements Built<CustomNumber1Filter, CustomNumber1FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_NUMBER_1')
  CatalogsProductGroupUint32Criteria get cUSTOMNUMBER1;

  CustomNumber1Filter._();

  factory CustomNumber1Filter([void updates(CustomNumber1FilterBuilder b)]) = _$CustomNumber1Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomNumber1FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomNumber1Filter> get serializer => _$CustomNumber1FilterSerializer();
}

class _$CustomNumber1FilterSerializer implements PrimitiveSerializer<CustomNumber1Filter> {
  @override
  final Iterable<Type> types = const [CustomNumber1Filter, _$CustomNumber1Filter];

  @override
  final String wireName = r'CustomNumber1Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomNumber1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_NUMBER_1';
    yield serializers.serialize(
      object.cUSTOMNUMBER1,
      specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomNumber1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomNumber1FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_NUMBER_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
          ) as CatalogsProductGroupUint32Criteria;
          result.cUSTOMNUMBER1 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomNumber1Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomNumber1FilterBuilder();
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

