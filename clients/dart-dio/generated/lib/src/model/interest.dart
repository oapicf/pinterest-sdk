//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'interest.g.dart';

/// Interest
///
/// Properties:
/// * [canonicalUrl] 
/// * [id] 
/// * [key] 
/// * [name] 
@BuiltValue()
abstract class Interest implements Built<Interest, InterestBuilder> {
  @BuiltValueField(wireName: r'canonical_url')
  String? get canonicalUrl;

  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'key')
  String? get key;

  @BuiltValueField(wireName: r'name')
  String? get name;

  Interest._();

  factory Interest([void updates(InterestBuilder b)]) = _$Interest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InterestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Interest> get serializer => _$InterestSerializer();
}

class _$InterestSerializer implements PrimitiveSerializer<Interest> {
  @override
  final Iterable<Type> types = const [Interest, _$Interest];

  @override
  final String wireName = r'Interest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Interest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.canonicalUrl != null) {
      yield r'canonical_url';
      yield serializers.serialize(
        object.canonicalUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
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
  }

  @override
  Object serialize(
    Serializers serializers,
    Interest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InterestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'canonical_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.canonicalUrl = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Interest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InterestBuilder();
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

