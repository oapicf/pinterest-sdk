//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'single_interest_targeting_option_response.g.dart';

/// SingleInterestTargetingOptionResponse
///
/// Properties:
/// * [childInterests] 
/// * [id] 
/// * [level] 
/// * [name] 
@BuiltValue()
abstract class SingleInterestTargetingOptionResponse implements Built<SingleInterestTargetingOptionResponse, SingleInterestTargetingOptionResponseBuilder> {
  @BuiltValueField(wireName: r'child_interests')
  BuiltList<String>? get childInterests;

  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'level')
  int? get level;

  @BuiltValueField(wireName: r'name')
  String? get name;

  SingleInterestTargetingOptionResponse._();

  factory SingleInterestTargetingOptionResponse([void updates(SingleInterestTargetingOptionResponseBuilder b)]) = _$SingleInterestTargetingOptionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SingleInterestTargetingOptionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SingleInterestTargetingOptionResponse> get serializer => _$SingleInterestTargetingOptionResponseSerializer();
}

class _$SingleInterestTargetingOptionResponseSerializer implements PrimitiveSerializer<SingleInterestTargetingOptionResponse> {
  @override
  final Iterable<Type> types = const [SingleInterestTargetingOptionResponse, _$SingleInterestTargetingOptionResponse];

  @override
  final String wireName = r'SingleInterestTargetingOptionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SingleInterestTargetingOptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.childInterests != null) {
      yield r'child_interests';
      yield serializers.serialize(
        object.childInterests,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.level != null) {
      yield r'level';
      yield serializers.serialize(
        object.level,
        specifiedType: const FullType(int),
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
    SingleInterestTargetingOptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SingleInterestTargetingOptionResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'child_interests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.childInterests.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.level = valueDes;
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
  SingleInterestTargetingOptionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SingleInterestTargetingOptionResponseBuilder();
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

