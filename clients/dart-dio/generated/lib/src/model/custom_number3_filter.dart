//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_number3_filter.g.dart';

/// CustomNumber3Filter
///
/// Properties:
/// * [cUSTOMNUMBER3] 
@BuiltValue()
abstract class CustomNumber3Filter implements Built<CustomNumber3Filter, CustomNumber3FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_NUMBER_3')
  CatalogsProductGroupUint32Criteria get cUSTOMNUMBER3;

  CustomNumber3Filter._();

  factory CustomNumber3Filter([void updates(CustomNumber3FilterBuilder b)]) = _$CustomNumber3Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomNumber3FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomNumber3Filter> get serializer => _$CustomNumber3FilterSerializer();
}

class _$CustomNumber3FilterSerializer implements PrimitiveSerializer<CustomNumber3Filter> {
  @override
  final Iterable<Type> types = const [CustomNumber3Filter, _$CustomNumber3Filter];

  @override
  final String wireName = r'CustomNumber3Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomNumber3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_NUMBER_3';
    yield serializers.serialize(
      object.cUSTOMNUMBER3,
      specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomNumber3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomNumber3FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_NUMBER_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
          ) as CatalogsProductGroupUint32Criteria;
          result.cUSTOMNUMBER3 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomNumber3Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomNumber3FilterBuilder();
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

