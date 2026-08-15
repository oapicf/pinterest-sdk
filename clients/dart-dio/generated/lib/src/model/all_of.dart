//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'all_of.g.dart';

/// AllOf
///
/// Properties:
/// * [allOf] 
@BuiltValue()
abstract class AllOf implements Built<AllOf, AllOfBuilder> {
  @BuiltValueField(wireName: r'all_of')
  BuiltList<CatalogsProductGroupFilterKeys> get allOf;

  AllOf._();

  factory AllOf([void updates(AllOfBuilder b)]) = _$AllOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AllOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AllOf> get serializer => _$AllOfSerializer();
}

class _$AllOfSerializer implements PrimitiveSerializer<AllOf> {
  @override
  final Iterable<Type> types = const [AllOf, _$AllOf];

  @override
  final String wireName = r'AllOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'all_of';
    yield serializers.serialize(
      object.allOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AllOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AllOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'all_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsProductGroupFilterKeys>;
          result.allOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AllOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AllOfBuilder();
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

