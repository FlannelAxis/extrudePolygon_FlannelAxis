
//create an extruded polygon
CSG polygon = Extrude.points(new Vector3d(0, 0, 40),// This is the  extrusion depth
                new Vector3d(7,23,3),// All values after this are the points in the polygon
                new Vector3d(80,0),// Bottom right corner
                new Vector3d(60,50),// upper right corner
                new Vector3d(20,40,-5)// upper left corner
        );
return polygon