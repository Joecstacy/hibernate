# hibernate with annotation

# A very basic java project with MySql connectivity via Hibernate ORM tool.
# Add new student in Student table and corresponding address in Address table.
# Use of several basic hibernate annotations like:
  @Entity
  @Table(name="in db table")
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="in  db table")
  @Temporal(TemporalType.DATE)
  @Lob
