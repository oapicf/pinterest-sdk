//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_subcategory.g.dart';

/// AudienceSubcategory
///
/// Properties:
/// * [id] - Subinterest ID.
/// * [index] - Subinterest affinity index.
/// * [key] - Interest unique key (same as ID).
/// * [name] - Subinterest name.
/// * [ratio] - Subinterest's percent of category's total audience.
@BuiltValue()
abstract class AudienceSubcategory implements Built<AudienceSubcategory, AudienceSubcategoryBuilder> {
  /// Subinterest ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Subinterest affinity index.
  @BuiltValueField(wireName: r'index')
  num? get index;

  /// Interest unique key (same as ID).
  @BuiltValueField(wireName: r'key')
  String? get key;

  /// Subinterest name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Subinterest's percent of category's total audience.
  @BuiltValueField(wireName: r'ratio')
  num? get ratio;

  AudienceSubcategory._();

  factory AudienceSubcategory([void updates(AudienceSubcategoryBuilder b)]) = _$AudienceSubcategory;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceSubcategoryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceSubcategory> get serializer => _$AudienceSubcategorySerializer();
}

class _$AudienceSubcategorySerializer implements PrimitiveSerializer<AudienceSubcategory> {
  @override
  final Iterable<Type> types = const [AudienceSubcategory, _$AudienceSubcategory];

  @override
  final String wireName = r'AudienceSubcategory';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceSubcategory object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(num),
      );
    }
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.ratio != null) {
      yield r'ratio';
      yield serializers.serialize(
        object.ratio,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceSubcategory object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceSubcategoryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.index = valueDes;
          break;
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.key = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'ratio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.ratio = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceSubcategory deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceSubcategoryBuilder();
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

