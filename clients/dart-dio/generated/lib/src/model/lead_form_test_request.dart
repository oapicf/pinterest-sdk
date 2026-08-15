//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_test_request.g.dart';

/// Request to create test data for lead data test API.
///
/// Properties:
/// * [answers] - Test lead answers. Should follow the creation order.
@BuiltValue()
abstract class LeadFormTestRequest implements Built<LeadFormTestRequest, LeadFormTestRequestBuilder> {
  /// Test lead answers. Should follow the creation order.
  @BuiltValueField(wireName: r'answers')
  BuiltList<String> get answers;

  LeadFormTestRequest._();

  factory LeadFormTestRequest([void updates(LeadFormTestRequestBuilder b)]) = _$LeadFormTestRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormTestRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormTestRequest> get serializer => _$LeadFormTestRequestSerializer();
}

class _$LeadFormTestRequestSerializer implements PrimitiveSerializer<LeadFormTestRequest> {
  @override
  final Iterable<Type> types = const [LeadFormTestRequest, _$LeadFormTestRequest];

  @override
  final String wireName = r'LeadFormTestRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormTestRequest object, {
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
    LeadFormTestRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormTestRequestBuilder result,
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
  LeadFormTestRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormTestRequestBuilder();
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

