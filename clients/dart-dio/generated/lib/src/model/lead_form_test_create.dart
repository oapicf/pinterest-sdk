//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_test_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [answers] - Test lead answers. Should follow the creation order.
@BuiltValue()
abstract class LeadFormTestCreate implements Built<LeadFormTestCreate, LeadFormTestCreateBuilder> {
  /// Test lead answers. Should follow the creation order.
  @BuiltValueField(wireName: r'answers')
  BuiltList<String> get answers;

  LeadFormTestCreate._();

  factory LeadFormTestCreate([void updates(LeadFormTestCreateBuilder b)]) = _$LeadFormTestCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormTestCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormTestCreate> get serializer => _$LeadFormTestCreateSerializer();
}

class _$LeadFormTestCreateSerializer implements PrimitiveSerializer<LeadFormTestCreate> {
  @override
  final Iterable<Type> types = const [LeadFormTestCreate, _$LeadFormTestCreate];

  @override
  final String wireName = r'LeadFormTestCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormTestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'answers';
    yield serializers.serialize(
      object.answers,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormTestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormTestCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'answers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.answers.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormTestCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormTestCreateBuilder();
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

