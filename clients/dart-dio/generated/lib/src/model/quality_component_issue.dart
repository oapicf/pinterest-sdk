//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quality_component_issue.g.dart';

/// Details of an issue with a quality component.
///
/// Properties:
/// * [id] - Unique identifier for the issue check.
/// * [name] - Human-readable name of the issue.
/// * [reason] - Detailed reason for the issue.
@BuiltValue()
abstract class QualityComponentIssue implements Built<QualityComponentIssue, QualityComponentIssueBuilder> {
  /// Unique identifier for the issue check.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Human-readable name of the issue.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Detailed reason for the issue.
  @BuiltValueField(wireName: r'reason')
  String get reason;

  QualityComponentIssue._();

  factory QualityComponentIssue([void updates(QualityComponentIssueBuilder b)]) = _$QualityComponentIssue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QualityComponentIssueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QualityComponentIssue> get serializer => _$QualityComponentIssueSerializer();
}

class _$QualityComponentIssueSerializer implements PrimitiveSerializer<QualityComponentIssue> {
  @override
  final Iterable<Type> types = const [QualityComponentIssue, _$QualityComponentIssue];

  @override
  final String wireName = r'QualityComponentIssue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QualityComponentIssue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'reason';
    yield serializers.serialize(
      object.reason,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    QualityComponentIssue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QualityComponentIssueBuilder result,
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.reason = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QualityComponentIssue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QualityComponentIssueBuilder();
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

