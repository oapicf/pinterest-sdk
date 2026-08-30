//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_test.g.dart';

/// Lead form test action: submit sample answers and receive the resulting subscription id.
///
/// Properties:
/// * [subscriptionId] - Subscription ID.
@BuiltValue()
abstract class LeadFormTest implements Built<LeadFormTest, LeadFormTestBuilder> {
  /// Subscription ID.
  @BuiltValueField(wireName: r'subscription_id')
  String? get subscriptionId;

  LeadFormTest._();

  factory LeadFormTest([void updates(LeadFormTestBuilder b)]) = _$LeadFormTest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormTestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormTest> get serializer => _$LeadFormTestSerializer();
}

class _$LeadFormTestSerializer implements PrimitiveSerializer<LeadFormTest> {
  @override
  final Iterable<Type> types = const [LeadFormTest, _$LeadFormTest];

  @override
  final String wireName = r'LeadFormTest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormTest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.subscriptionId != null) {
      yield r'subscription_id';
      yield serializers.serialize(
        object.subscriptionId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormTest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormTestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'subscription_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.subscriptionId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormTest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormTestBuilder();
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

