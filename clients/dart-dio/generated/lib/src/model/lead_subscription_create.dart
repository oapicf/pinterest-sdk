//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_subscription_create.g.dart';

/// LeadSubscriptionCreate
///
/// Properties:
/// * [leadFormId] - Lead form ID.
/// * [webhookUrl] - Standard HTTPS webhook URL.
@BuiltValue(instantiable: false)
abstract class LeadSubscriptionCreate  {
  /// Lead form ID.
  @BuiltValueField(wireName: r'lead_form_id')
  String? get leadFormId;

  /// Standard HTTPS webhook URL.
  @BuiltValueField(wireName: r'webhook_url')
  String get webhookUrl;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadSubscriptionCreate> get serializer => _$LeadSubscriptionCreateSerializer();
}

class _$LeadSubscriptionCreateSerializer implements PrimitiveSerializer<LeadSubscriptionCreate> {
  @override
  final Iterable<Type> types = const [LeadSubscriptionCreate];

  @override
  final String wireName = r'LeadSubscriptionCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadSubscriptionCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType(String),
      );
    }
    yield r'webhook_url';
    yield serializers.serialize(
      object.webhookUrl,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadSubscriptionCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  LeadSubscriptionCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($LeadSubscriptionCreate)) as $LeadSubscriptionCreate;
  }
}

/// a concrete implementation of [LeadSubscriptionCreate], since [LeadSubscriptionCreate] is not instantiable
@BuiltValue(instantiable: true)
abstract class $LeadSubscriptionCreate implements LeadSubscriptionCreate, Built<$LeadSubscriptionCreate, $LeadSubscriptionCreateBuilder> {
  $LeadSubscriptionCreate._();

  factory $LeadSubscriptionCreate([void Function($LeadSubscriptionCreateBuilder)? updates]) = _$$LeadSubscriptionCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($LeadSubscriptionCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$LeadSubscriptionCreate> get serializer => _$$LeadSubscriptionCreateSerializer();
}

class _$$LeadSubscriptionCreateSerializer implements PrimitiveSerializer<$LeadSubscriptionCreate> {
  @override
  final Iterable<Type> types = const [$LeadSubscriptionCreate, _$$LeadSubscriptionCreate];

  @override
  final String wireName = r'$LeadSubscriptionCreate';

  @override
  Object serialize(
    Serializers serializers,
    $LeadSubscriptionCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(LeadSubscriptionCreate))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadSubscriptionCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'webhook_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.webhookUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $LeadSubscriptionCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $LeadSubscriptionCreateBuilder();
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

