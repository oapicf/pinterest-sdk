//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_number0_filter.g.dart';

/// CustomNumber0Filter
///
/// Properties:
/// * [CUSTOM_NUMBER_0] 
@BuiltValue()
abstract class CustomNumber0Filter implements Built<CustomNumber0Filter, CustomNumber0FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_NUMBER_0')
  CatalogsProductGroupUint32Criteria get CUSTOM_NUMBER_0;

  CustomNumber0Filter._();

  factory CustomNumber0Filter([void updates(CustomNumber0FilterBuilder b)]) = _$CustomNumber0Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomNumber0FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomNumber0Filter> get serializer => _$CustomNumber0FilterSerializer();
}

class _$CustomNumber0FilterSerializer implements PrimitiveSerializer<CustomNumber0Filter> {
  @override
  final Iterable<Type> types = const [CustomNumber0Filter, _$CustomNumber0Filter];

  @override
  final String wireName = r'CustomNumber0Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomNumber0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_NUMBER_0';
    yield serializers.serialize(
      object.CUSTOM_NUMBER_0,
      specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomNumber0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomNumber0FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_NUMBER_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
          ) as CatalogsProductGroupUint32Criteria;
          result.CUSTOM_NUMBER_0.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomNumber0Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomNumber0FilterBuilder();
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

