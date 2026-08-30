//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_policy_link.g.dart';

/// LeadFormPolicyLink
///
/// Properties:
/// * [label] - Policy label for an additional policy link.
/// * [link] - Policy link for an additional policy link.
@BuiltValue()
abstract class LeadFormPolicyLink implements Built<LeadFormPolicyLink, LeadFormPolicyLinkBuilder> {
  /// Policy label for an additional policy link.
  @BuiltValueField(wireName: r'label')
  String? get label;

  /// Policy link for an additional policy link.
  @BuiltValueField(wireName: r'link')
  String? get link;

  LeadFormPolicyLink._();

  factory LeadFormPolicyLink([void updates(LeadFormPolicyLinkBuilder b)]) = _$LeadFormPolicyLink;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormPolicyLinkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormPolicyLink> get serializer => _$LeadFormPolicyLinkSerializer();
}

class _$LeadFormPolicyLinkSerializer implements PrimitiveSerializer<LeadFormPolicyLink> {
  @override
  final Iterable<Type> types = const [LeadFormPolicyLink, _$LeadFormPolicyLink];

  @override
  final String wireName = r'LeadFormPolicyLink';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormPolicyLink object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.label != null) {
      yield r'label';
      yield serializers.serialize(
        object.label,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormPolicyLink object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormPolicyLinkBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.label = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormPolicyLink deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormPolicyLinkBuilder();
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

